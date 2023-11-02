import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CountriesService } from 'src/app/services/countries.service';
@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.css']
})
export class LocationsComponent 
{
  locations:any=[];
  constructor(private _countries:CountriesService)
  {
    this.locations=this._countries.getCountry();
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
        this.locations=result;
        console.log(result);
      })
  }
}
