import { ReactNode } from 'react'

import { Logo } from '@/components'

import './Header.styles.scss'

interface HeaderProps {
  children?: ReactNode
}

export default function Header({ children }: HeaderProps) {
  return (
    <header className="header__wrapper">
      <div className="container header__container">
        <Logo />
        {!!children && children}
      </div>
    </header>
  )
}
