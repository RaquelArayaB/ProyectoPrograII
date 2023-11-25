import { Component } from '@angular/core';
import { NavigationExtras, Route, Router } from '@angular/router';

@Component({
  selector: 'app-layout',
  templateUrl: '/layout.component.html',
  styleUrls: ['/layout.component.scss']
})
export class LayoutComponent {
constructor(private router: Router){

}

close(){
  const NavigationExtras: NavigationExtras = {};
  this.router.navigateByUrl('login', NavigationExtras)
}
}
