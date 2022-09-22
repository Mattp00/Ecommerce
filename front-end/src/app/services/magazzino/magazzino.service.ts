import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/app/models/cliente/cliente';
import { Ordine } from 'src/app/models/ordine/ordine';

@Injectable({
  providedIn: 'root'
})
export class MagazzinoService {

  constructor() { }

 /* public getOrdini(cliente : Cliente) : Observable<Ordine>
  { return;
  }*/
}
