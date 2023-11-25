import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavigationExtras, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  loginForm: FormGroup;

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private http: HttpClient) {
    this.loginForm = this.formBuilder.group(
      {
        usuario: ['', [Validators.required]],
        contraseña: ['', [Validators.required]]
      }
    );
  }
  onLogin() {
    debugger;

    if (this.loginForm.valid) {
      // URL de la API que deseas llamar
      const apiUrl = 'http://localhost:8080/api/usuario/login';
      const usuarioValue = this.loginForm.controls['usuario'].value ?? '';
      const contraseñaValue = this.loginForm.controls['contraseña'].value ?? '';
      // Datos a enviar a la API
      const requestData = {
        email: usuarioValue,
        contraseña: contraseñaValue
      };

      // Encabezados HTTP (Content-Type)
      const headers = new HttpHeaders({
        'Content-Type': 'application/json'
      });

      this.http.post(apiUrl, requestData, { headers: headers })
        .subscribe((response) => {
          // Maneja la respuesta de la API aquí
          if (response) {
            const NavigationExtras: NavigationExtras = {};
            this.router.navigateByUrl('table', NavigationExtras)
          } 
          //Este era el autiguo mensaje, con el que se verifico que llego la info correcta
         // console.log('Respuesta de la API:', response);
         // alert(JSON.stringify(response))
        }, (error) => {
          // Maneja errores aquí
          console.error('Error al llamar a la API:', error);
          alert('usuario no existe')
        });
    }
  }
}