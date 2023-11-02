import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CountriesService 
{

  private _countriesURL = "https://restcountries.com/v3.1/independent?status=true";

  constructor(private _http:HttpClient) {}

  getCountry():Observable<[]>
  {
    return this._http.get<[]>(this._countriesURL);
  }
}
