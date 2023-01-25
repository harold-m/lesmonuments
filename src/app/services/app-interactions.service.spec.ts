import { TestBed } from '@angular/core/testing';

import { AppInteractionsService } from './app-interactions.service';

describe('AppInteractionsService', () => {
  let service: AppInteractionsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AppInteractionsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
