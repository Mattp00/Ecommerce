import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage/homepage.component';
import { RegistrazioneComponent } from './registrazione/registrazione/registrazione.component';
import { FormComponent } from './form/form/form.component';
import { FormRegistrazioneComponent } from './form/form-Registrazione/form-registrazione/form-registrazione.component';
import { HttpClientModule } from '@angular/common/http';
import { StoreComponent } from './store/store.component';
import { AmministrazioneComponent } from './amministrazione/amministrazione.component';


@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    RegistrazioneComponent,
    FormComponent,
    FormRegistrazioneComponent,
    StoreComponent,
    AmministrazioneComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
