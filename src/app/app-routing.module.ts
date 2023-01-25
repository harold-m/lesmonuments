import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MonumentsComponent } from './monuments/monuments.component';
import { NewMonumentComponent } from './new-monument/new-monument.component';

const routes: Routes = [{
  path: "monument/all", component: MonumentsComponent


}, {
  path: "newmonument", component: NewMonumentComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
