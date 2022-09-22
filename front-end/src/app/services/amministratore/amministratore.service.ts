import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/app/models/cliente/cliente';
import { Ordine } from 'src/app/models/ordine/ordine';

@Injectable({
  providedIn: 'root'
})
export class AmministratoreService {

  constructor(private http : HttpClient) {}

  public getClienti() : Observable<Cliente[]>
  { return this.http.get<Cliente[]>('http://localhost:8080/amministrazione/clienti');
  }

  public getOrdini() :  Observable<Ordine[]>
  { return this.http.get<Ordine[]>('http://localhost:8080/amministrazione/ordini');
  }


}
