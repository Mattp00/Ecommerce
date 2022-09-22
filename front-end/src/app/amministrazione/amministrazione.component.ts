import { Component, OnInit } from '@angular/core';
import { Cliente } from '../models/cliente/cliente';
import { AmministratoreService } from '../services/amministratore/amministratore.service';
import { ClienteService } from '../services/cliente/cliente.service';


@Component({
  selector: 'app-amministrazione',
  templateUrl: './amministrazione.component.html',
  styleUrls: ['./amministrazione.component.css']
})
export class AmministrazioneComponent implements OnInit 
{ clienti : Cliente[] = [];

  constructor(private clienteService : ClienteService, private amministratoreService : AmministratoreService) { }

  ritornaClienti() : void
  { this.amministratoreService.getClienti().subscribe
    ( (res :  Cliente[]) =>
        { this.clienti = res;
          console.log(this.clienti);
        }
    )
  }

  ngOnInit(): void 
  {
  }

}
