import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { ActivatedRoute, Router, NavigationExtras } from '@angular/router';

export interface Itema {
  tema_id: number;
  nombre: String;
  descripcion: String
}

@Component({
  selector: 'app-tabla-tema',
  templateUrl: './tabla-tema.component.html',
  styleUrls: ['./tabla-tema.component.scss']
})
export class TablaTemaComponent {
  displayedColumns: string[] = ['tema_id', 'nombre', 'descripcion', 'iniciar'];
  dataSource: Itema[] = [];
  courseId: number = 0;
  dataSourceMatTable = new MatTableDataSource(this.dataSource);

  constructor(private http: HttpClient,
    private router: Router, private route: ActivatedRoute) {}

  ngOnInit(): void {
    const navigation = window.history.state;
    this.courseId = navigation.curso.curso_id;
    this.onGet();
  }

  onGet = () => {
    const apiUrl = 'http://localhost:8080/api/tema/byCourseId';
    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });

    const params = {
      courseId: this.courseId
    };

    this.http.get(apiUrl, { headers: headers, params: params })
      .subscribe((response: any) => {
        // Maneja la respuesta de la API aquí
        if (response) {
          this.dataSource = response;
          this.dataSourceMatTable = new MatTableDataSource(this.dataSource);

        }

      }, (error) => {
        // Maneja errores aquí
        console.error('Error al llamar a la API:', error);
        alert('tabla no existe')
      });
  }
  applyFilter(event: Event) {
    debugger
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSourceMatTable.filter = filterValue.trim().toLowerCase();
  }

  iniciar(row: Itema) {
    alert("Iniciar cuestionario");
    const navigationExtras: NavigationExtras = {
      state: {
        tema: row
      }
    };

    //this.router.navigateByUrl('tema', navigationExtras);
  };
}
