import { CommonComponent } from '@/interfaces'

import './Button.styles.scss'

interface ButtonProps extends CommonComponent {}

export default function Button({ children, className = '' }: ButtonProps) {
  return <button className={`button ${className}`}>{children}</button>
}
