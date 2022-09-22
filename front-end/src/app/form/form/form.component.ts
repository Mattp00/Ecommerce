import { Component, OnInit } from '@angular/core';
import  { FormControl,FormGroup,FormBuilder,Validators} from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit 
{
  form: FormGroup;

  constructor(private fb: FormBuilder)
  {   this.form = fb.group(
        { 'email':  ['',[Validators.required,Validators.email]],
          'password': ['',Validators.required]
        }
      );
  }

  ngOnInit(): void 
  {   console.log("init");
  }

  checkEmail()
  { 
  }


  send()
  { if (!this.form.valid)
    { alert("Compilare tutti i campi")
    }
    
    console.log(
      this.form.controls['email'].value,
      this.form.controls['password'].value
    )
  }

}
