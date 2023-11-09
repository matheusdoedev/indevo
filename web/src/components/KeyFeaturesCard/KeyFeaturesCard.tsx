import Image from 'next/image'

import { KeyFeaturesCardProps } from '@/interfaces'

import './KeyFeaturesCard.styles.scss'

export default function KeyFeaturesCard({
  title,
  imgSrc,
  text
}: Readonly<KeyFeaturesCardProps>) {
  return (
    <article className="key-features-card">
      <Image src={imgSrc} alt={title} width={443} height={360} />
      <div className="key-features-card__content">
        <h3 className="key-features-card__title">{title}</h3>
        <div className="key-features-card__separator"></div>
        <p className="key-features-card__text">{text}</p>
      </div>
    </article>
  )
}
