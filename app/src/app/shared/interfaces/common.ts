export type MediaType = 'image' | 'video' | 'image/video';

export interface Media {
  name: string;
  type?: MediaType;
  file?: File;
}

export interface SelectOption {
  label: string;
  value: string;
}
