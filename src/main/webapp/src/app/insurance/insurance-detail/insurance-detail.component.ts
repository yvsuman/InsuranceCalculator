import { Component, OnInit, Input, NgModule  } from '@angular/core';
import { Insurance } from '../insurance.model';
import { Risk } from '../risk.model';
import {CommonService} from "../../service/common.service";

@Component({
  selector: 'app-insurance-detail',
  templateUrl: './insurance-detail.component.html',
  styleUrls: ['./insurance-detail.component.css']
})
export class InsuranceDetailComponent implements OnInit {

   @Input() insurance:Insurance;
   @Input() riskArray:Risk;
   riskValue:number;
   public risk:any;
   riskCalculateValue:number;
   calcValue:boolean;
  constructor(private commonService: CommonService) { }

  ngOnInit() {
	  this.calcValue = false;
  }
  
   onCalculate(){
	this.insurance.risk = this.riskValue;
    this.commonService.calculateRisk(this.insurance)
      .subscribe( data => {
		this.risk = data;
      });
  }

}
