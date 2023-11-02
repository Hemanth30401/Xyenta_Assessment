import { Component } from '@angular/core';
import { CoursesServiceService } from 'src/app/services/courses-service.service';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  message:string;
  constructor(private _data:DataService){
  }

  ngOnInit(): void{
    this._data.currentmsg.subscribe(msg1 => this.message=msg1);
  }

}
