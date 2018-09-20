import { Component, OnInit,EventEmitter, Output } from '@angular/core';
import { Insurance } from '../insurance.model';

@Component({
  selector: 'app-insurance-list',
  templateUrl: './insurance-list.component.html',
  styleUrls: ['./insurance-list.component.css']
})
export class InsuranceListComponent implements OnInit {

  @Output() insuranceWasSelected = new EventEmitter<Insurance>();

   insurances:Insurance[] = [
    new Insurance('Bike','Coverage 0-3K',0),new Insurance('Jewellery','Coverage 500-10k',0),new Insurance('Electronics','Coverage 500-6k',0),new Insurance('Sports Equipment','Coverage 0-20k',0)];

  constructor() { }

  ngOnInit() {
  }

  oninsuranceSelected(insurance: Insurance){
            this.insuranceWasSelected.emit(insurance);
  }

}
