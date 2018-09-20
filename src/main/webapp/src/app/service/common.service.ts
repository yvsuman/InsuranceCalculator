import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Insurance} from "../insurance/insurance.model";

@Injectable()
export class CommonService {

  constructor(private http: HttpClient) { }
  baseUrl: string = 'http://localhost:8080/api/riskCalculation';

  calculateRisk(insurance: Insurance) {
    return this.http.post(this.baseUrl, insurance);
  }

}
