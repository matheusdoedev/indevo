export interface SignInDto {
  email: string;
  password: string;
}

export interface SignUpDto {
  firstName: string;
  lastName: string;
  username: string;
  email: string;
  password: string;
  hasAcceptedUseTerms: boolean;
}
