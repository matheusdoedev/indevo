import type { Metadata } from 'next'
import { ReactNode } from 'react'

import { CommonComponent } from '@/interfaces'

import '@/styles/index.scss'

interface RootLayoutProps extends CommonComponent {
  children: ReactNode
}

export const metadata: Metadata = {
  title: 'Indevo - Your Personal PDI App Builder',
  description: 'Your Personal PDI App Builder',
  keywords: 'PDI, personal, development, plan, individual, app, web',
  robots: 'index, follow',
  icons: [
    { type: 'image/svg+x', url: '/assets/favicon.ico' },
    { type: 'image/png', sizes: '32x32', url: '/assets/favicon-32x32.png' },
    { type: 'image/png', sizes: '16x16', url: '/assets/favicon-16x16.png' },
    {
      rel: 'apple-touch-icon',
      sizes: '180x180',
      url: '/assets/apple-touch-icon.png'
    }
  ],
  manifest: '/assets/site.webmanifest'
}

export default function RootLayout({ children }: Readonly<RootLayoutProps>) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  )
}
