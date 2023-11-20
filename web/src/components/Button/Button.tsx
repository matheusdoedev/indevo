import { CommonComponent } from '@/interfaces'

import './Button.styles.scss'

interface ButtonProps extends CommonComponent {
  onClick: (event: unknown) => void
}

export default function Button({
  children,
  className = '',
  ...props
}: Readonly<ButtonProps>) {
  return (
    <button className={`button ${className}`} {...props}>
      {children}
    </button>
  )
}
