import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

/** Componente table */
import { TableComponent } from './table/table.component';
import { MatTableModule } from '@angular/material/table';


/** Componente form */

import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { LayoutComponent } from './layout/layout.component';
import { MatToolbarModule } from '@angular/material/toolbar';

import { TablaTemaComponent } from './tabla-tema/tabla-tema.component';


@NgModule({
  declarations: [
    AppComponent,
    TableComponent,

    LoginComponent,
    RegisterComponent,
    LayoutComponent,

    TablaTemaComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    /** Componete button */
    MatIconModule,
    /** componente table */
    MatTableModule,
    /** componente form */
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatIconModule,
    MatToolbarModule,
    HttpClientModule


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
