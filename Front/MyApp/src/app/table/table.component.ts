import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import { NavigationExtras, Router } from '@angular/router';


export interface Icurso {
  curso_id: number;
  tema_id: number;
  nombre: String;
  points: number
  descripcion: String
}

/**
 * @title Basic use of `<table mat-table>`
 */
@Component({
  selector: 'table.component',
  templateUrl: 'table.component.html',
  styleUrls: ['table.component.scss']


})
export class TableComponent {
  displayedColumns: string[] = ['curso_id', 'tema_id', 'nombre', 'points', 'descripcion', 'seleccionar'];
  dataSource: Icurso[] = [];

  constructor(private http: HttpClient,
    private router: Router) { }

  ngOnInit(): void {
    this.onGet();
  }
  seleccionar(row: Icurso) {
    const navigationExtras: NavigationExtras = {
      state: {
        curso: row
      }
    };

    this.router.navigateByUrl('tema', navigationExtras);
  };

  onGet = () => {
    const apiUrl = 'http://localhost:8080/api/curso';
    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });


    this.http.get(apiUrl, { headers: headers })

      .subscribe((response: any) => {
        // Maneja la respuesta de la API aquí
        if (response) {
          this.dataSource = response;
        }

      }, (error) => {
        // Maneja errores aquí
        console.error('Error al llamar a la API:', error);
        alert('usuario no existe')
      });
  }

}
