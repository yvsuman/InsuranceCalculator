import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { Insurance } from '../../insurance.model';

@Component({
  selector: 'app-insurance-item',
  templateUrl: './insurance-item.component.html',
  styleUrls: ['./insurance-item.component.css']
})
export class InsuranceItemComponent implements OnInit {
  @Input() insurance: Insurance;
  @Output() insuranceSelected = new EventEmitter<void>();

  constructor() { }

  ngOnInit() {
  }

  onSelected(){
    this.insuranceSelected.emit();
  }


}
