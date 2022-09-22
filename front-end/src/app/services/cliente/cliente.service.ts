import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/app/models/cliente/cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private http: HttpClient) {}

  public registraCliente(cliente : Cliente): Observable<any>
  { console.log(cliente.nome)
    return this.http.post('http://localhost/8080/account/registrazione',cliente,{responseType: 'text'}); 
  }

  public removeCliente(id : number)
  { const url = 'http://localhost/8080/amministrazione/clienti/remove/'+id;
    this.http.delete(url).subscribe(data => {
    console.log(data);
    });
  }
}
