import { TestBed } from '@angular/core/testing';

import { IndevoServiceService } from './indevo-service.service';

describe('IndevoServiceService', () => {
  let service: IndevoServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(IndevoServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
