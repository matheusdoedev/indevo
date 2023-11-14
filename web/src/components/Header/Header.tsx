'use client'

import { ReactNode, useEffect } from 'react'

import { CTAButton, Logo } from '@/components'

import './Header.styles.scss'

interface HeaderProps {
  children?: ReactNode
}

export default function Header({ children }: Readonly<HeaderProps>) {
  useEffect(() => {
    const header = document.getElementById('header') as HTMLElement

    const handleAnimationOnScroll = () => {
      const scrollTop = document.documentElement.scrollTop
      const headerRect = header.getBoundingClientRect()

      if (scrollTop > headerRect.height) {
        header.classList.add('header--scroll-animation')
      } else {
        header.classList.remove('header--scroll-animation')
      }
    }

    window.addEventListener('scroll', handleAnimationOnScroll)

    return () => {
      window.removeEventListener('scroll', handleAnimationOnScroll)
    }
  }, [])

  return (
    <header id="header" className="header__wrapper">
      <div className="container header__container">
        <Logo />
        <div className="header__content">
          {!!children && children}
          <CTAButton />
        </div>
      </div>
    </header>
  )
}
