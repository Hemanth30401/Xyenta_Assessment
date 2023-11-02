import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CountriesService } from 'src/app/services/countries.service';
@Component({
  selector: 'app-timezones',
  templateUrl: './timezones.component.html',
  styleUrls: ['./timezones.component.css']
})
export class TimezonesComponent 
{
  timezones:any=[];
  constructor(private _countries:CountriesService)
  {
    this.timezones=this._countries.getCountry();
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
        this.timezones=result;
        console.log(result);
      })
  }
}
