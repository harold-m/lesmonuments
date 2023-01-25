import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppInteractionsService {
  public host = "http://localhost:8080";

  constructor(private HttpClient: HttpClient) { }

  public getMonuments() {
    return this.HttpClient.get("http://localhost:8080/monument/all");
  }

  public deleteMonument(url: string) {
    return this.HttpClient.delete(url);

  }
  public saveMonument(url: string, data: any) {
    return this.HttpClient.post(url, data);
  }

  public getMonumentBytown(villes: String) {
  }

}
