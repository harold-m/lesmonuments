import { HttpClient } from '@angular/common/http';
import { Component, Injectable, OnInit } from '@angular/core';
import { AppInteractionsService } from '../services/app-interactions.service';
import { NewMonumentComponent } from '../new-monument/new-monument.component'


@Component({
  selector: 'app-monuments',
  templateUrl: './monuments.component.html',
  styleUrls: ['./monuments.component.css']
})

export class MonumentsComponent implements OnInit {
  public monuments: any;
  //readonly API_URL = "http://localhost:8080/monument"
  //readonly ENDPOINT_MON = "/all"

  constructor(private appInteract: AppInteractionsService) { }

  ngOnInit(): void {
  }
  onGetMonument() {

    return this.appInteract.getMonuments()
      .subscribe(data => {
        this.monuments = data; console.log(data)


      });

  }

  oneDeleteMonument(m: any) {
    let conf = confirm("Voulez vous supprimer ce monument ?");
    if (conf) {
      this.appInteract.deleteMonument(m)
        .subscribe(data => {
          this.onGetMonument();
        });


    }


  }

  Onsearch(value: any) {

  }
  monumentOfMontpellier(nomCom: String) {




  }

  monumentOfUzes() {

  }

  monumentOfPezenas() {

  }
}
