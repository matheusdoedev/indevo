import type { Metadata } from 'next'
import { ReactNode } from 'react'

import { CommonComponent } from '@/interfaces'

import '@/styles/index.scss'

interface RootLayoutProps extends CommonComponent {
  children: ReactNode
}

export const metadata: Metadata = {
  title: 'Indevo'
}

export default function RootLayout({ children }: Readonly<RootLayoutProps>) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  )
}
