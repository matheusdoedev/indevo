'use client'

import { useEffect } from 'react'
import Image from 'next/image'

import { CTAButton, Footer, Header, KeyFeaturesCard } from '@/components'
import { HOME_NAV_OPTIONS, KEY_FEATURES_CARDS } from '@/constants'

import './Home.styles.scss'

export default function Home() {
  useEffect(() => {
    const internLinks = document.querySelectorAll('a[href^="#"]')

    const scrollToSection = (event: any) => {
      event.preventDefault()
      const href = event.currentTarget.getAttribute('href')
      const section = document.querySelector(href)

      section.scrollIntoView({
        behavior: 'smooth',
        block: 'start'
      })
    }

    internLinks.forEach((link) => {
      link.addEventListener('click', scrollToSection)
    })
  }, [])

  return (
    <div>
      <Header>
        <nav>
          <ul className="home__navigation__list">{HOME_NAV_OPTIONS}</ul>
        </nav>
      </Header>

      <section className="intro">
        <div className="container intro__container">
          <Image
            className="intro__background"
            src="/assets/images/intro-bg.jpg"
            alt="Intro"
            width={1360}
            height={550}
          />
          <section className="intro__content">
            <h1 className="intro__title">Your Personal PDI App Builder</h1>
            <p className="intro__text">
              Unlock Your Full Potential with Indevo: Your Ultimate Personal
              Development Planner
            </p>
            <CTAButton />
          </section>
        </div>
      </section>

      <section id="about" className="about">
        <div className="container about__container">
          <h2 className="about__title">About</h2>
          <p className="about__text">
            In the pursuit of personal and professional growth, having a clear
            roadmap and an organized plan can make all the difference.
            <br />
            <br /> Introducing Indevo, a game-changing free and open source
            Personal Development Planner designed to empower individuals on
            their journey to self-improvement and success.
          </p>
        </div>
      </section>

      <section id="key-features" className="key-features">
        <div className="container key-features__container">
          <div className="key-features__title-container">
            <Image
              className="key-features__title-container__image"
              src="/assets/images/key-features-title-bg.jpg"
              alt="Key Features"
              width={1360}
              height={73}
            />
            <h2 className="key-features__title">Key Features</h2>
          </div>
          <div className="key-features__list">
            {KEY_FEATURES_CARDS.map(({ title, imgSrc, text }) => (
              <KeyFeaturesCard
                key={title}
                title={title}
                imgSrc={imgSrc}
                text={text}
              />
            ))}
          </div>
        </div>
      </section>

      <section className="cta-section">
        <div className="container cta-section__container">
          <h2 className="container cta-section__title">Getting Started</h2>
          <p className="container cta-section__text">
            {' '}
            Ready to embark on a journey of self-discovery and growth? Click in
            the button below and get started.
          </p>
          <CTAButton />
        </div>
      </section>

      <Footer />
    </div>
  )
}
