import { Component } from '@angular/core';
import { CountriesService } from 'src/app/services/countries.service';

@Component({
  selector: 'app-continents',
  templateUrl: './continents.component.html',
  styleUrls: ['./continents.component.css']
})
export class ContinentsComponent 
{
  continents:any=[];
  constructor(private _countries:CountriesService)
  {
    this.continents=this._countries.getCountry();
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
        this.continents=result;
        console.log(result);
      })
  }
}
