import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-registrazione',
  templateUrl: './form-registrazione.component.html',
  styleUrls: ['./form-registrazione.component.css']
})
export class FormRegistrazioneComponent implements OnInit 
{
  form: FormGroup;

  constructor(private fb: FormBuilder,)
  {   this.form = fb.group(
        { 'nome': ['',Validators.required],
          'cognome': ['',Validators.required],
          'email':  ['',[Validators.required,Validators.email]],
          'password': ['',Validators.required],
          'eta': ['',Validators.required],
        }
      );
  }

  ngOnInit(): void 
  {   console.log("init");
  }

  send()
  { if (!this.form.valid)
    { alert("Compilare tutti i campi")
    }
    
    console.log(
      this.form.controls['nome'].value,
      this.form.controls['cognome'].value,
      this.form.controls['email'].value,
      this.form.controls['eta'].value,
      this.form.controls['password'].value
    )
  }

}
