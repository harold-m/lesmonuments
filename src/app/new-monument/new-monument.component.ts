import { Component, Injectable, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppInteractionsService } from '../services/app-interactions.service';

@Component({
  selector: 'app-new-monument',
  templateUrl: './new-monument.component.html',
  styleUrls: ['./new-monument.component.css']
})
export class NewMonumentComponent implements OnInit {

  constructor(private appInteract: AppInteractionsService, private router: Router) { }

  ngOnInit(): void {
  }
  onSaveMonument(data: any) {
    this.appInteract.saveMonument(this.appInteract.host + "/monument/all", data)
      .subscribe(result => {
        console.log(result);
      })
  }

}
