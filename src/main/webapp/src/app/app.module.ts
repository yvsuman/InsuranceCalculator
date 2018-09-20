import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { InsuranceComponent } from './insurance/insurance.component';
import { InsuranceListComponent } from './insurance/insurance-list/insurance-list.component';
import { InsuranceDetailComponent } from './insurance/insurance-detail/insurance-detail.component';
import { InsuranceItemComponent } from './insurance/insurance-list/insurance-item/insurance-item.component';
import { CommonService } from './service/common.service';


@NgModule({
  declarations: [
    AppComponent,
    InsuranceComponent,
    InsuranceListComponent,
    InsuranceDetailComponent,
    InsuranceItemComponent
  ],
  imports: [
    BrowserModule,
	HttpClientModule,
	FormsModule
  ],
  providers: [CommonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
