import Link from 'next/link'

import { Button, KeyFeaturesCard } from '@/components'

export const KEY_FEATURES_CARDS = [
  {
    title: 'Goal Setting Made Easy',
    imgSrc: '/assets/images/key-features-card-1-bg.jpg',
    text: "Define your short-term and long-term goals with precision using Indevo. The app's intuitive interface guides you through the process, helping you articulate your aspirations clearly."
  },
  {
    title: 'Progress Tracking',
    imgSrc: '/assets/images/key-features-card-2-bg.jpg',
    text: 'Visualize your progress in real time. Monitor your achievements, milestones, and setbacks, enabling you to adjust your strategy as needed to stay on course.'
  },
  {
    title: 'Customized Action Plans',
    imgSrc: '/assets/images/key-features-card-3-bg.jpg',
    text: 'Transform your goals into actionable steps. Indevo assists you in breaking down your objectives into manageable tasks, ensuring that you stay focused and motivated.'
  }
].map(({ title, imgSrc, text }) => (
  <KeyFeaturesCard key={title} title={title} imgSrc={imgSrc} text={text} />
))

export const CTA_BUTTON = <Button>Start now</Button>

export const HOME_NAV_OPTIONS = [
  { label: 'About', href: '/#about' },
  { label: 'Key features', href: '/#key-features' }
].map(({ label, href }) => (
  <li className="home__navigation__item" key={label}>
    <Link href={href} className="home__navigation__link">
      {label}
    </Link>
  </li>
))
