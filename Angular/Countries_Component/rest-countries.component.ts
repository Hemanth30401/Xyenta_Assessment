import { Component } from '@angular/core';
import { CountriesService } from 'src/app/services/countries.service';

@Component({
  selector: 'app-rest-countries',
  templateUrl: './rest-countries.component.html',
  styleUrls: ['./rest-countries.component.css']
})
export class RestCountriesComponent 
{
  country:any=[];
  constructor(private _countries:CountriesService)
  {
    this.country=this._countries.getCountry();
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
        this.country=result;
        console.log(result);
      })
  }
}
