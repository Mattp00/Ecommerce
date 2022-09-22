import { Component, OnInit } from '@angular/core';
import { Cliente } from '../models/cliente/cliente';
import { Magazzino } from '../models/magazzino/magazzino';
import { Ordine } from '../models/ordine/ordine';
import { Prodotto } from '../models/prodotto/prodotto'


@Component({
  selector: 'app-store',
  templateUrl: './store.component.html',
  styleUrls: ['./store.component.css']
})
export class StoreComponent implements OnInit 
{  ordini : Ordine[];
   prodotti : Magazzino[];
   utenteLoggato : Cliente =
   {  id: -1,
      nome: "",
      cognome:"",
      email:"",
      eta: -1,
      password: ""
   };
   loggato : boolean = false;
   carrello : Prodotto[];

  constructor() {
    this.ordini = [];
    this.prodotti = [];
    this.carrello = [];
   }

  ngOnInit(): void {
  }

}
