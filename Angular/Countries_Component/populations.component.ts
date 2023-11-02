import { Component } from '@angular/core';
import { CountriesService } from 'src/app/services/countries.service';

@Component({
  selector: 'app-populations',
  templateUrl: './populations.component.html',
  styleUrls: ['./populations.component.css']
})
export class PopulationsComponent 
{
  populations:any=[];
  constructor(private _countries:CountriesService)
  {
    this.populations=this._countries.getCountry();
  }

  ngOnInit()
  {
    this.getCountriesList();
  }

  getCountriesList()
  {
    this._countries.getCountry().subscribe(
      (result)=>
      {
        this.populations=result;
        console.log(result);
      })
  }
}
