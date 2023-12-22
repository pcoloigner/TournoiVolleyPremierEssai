import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TournoisComponent } from './tournois/tournois.component';

const routes: Routes = [
  { path:"tournois", component : TournoisComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
