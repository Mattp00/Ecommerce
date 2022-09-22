import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage/homepage.component';
import { RegistrazioneComponent } from './registrazione/registrazione/registrazione.component';

const routes: Routes = 
[ { path: '', component: HomepageComponent },
  { path: 'registrazione-component', component: RegistrazioneComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
