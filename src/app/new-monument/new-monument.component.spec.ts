import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewMonumentComponent } from './new-monument.component';

describe('NewMonumentComponent', () => {
  let component: NewMonumentComponent;
  let fixture: ComponentFixture<NewMonumentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewMonumentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewMonumentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
