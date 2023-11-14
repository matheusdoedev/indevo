'use client'

import { useRouter } from 'next/navigation'

import { Button } from '@/components'

export default function CTAButton() {
  const router = useRouter()

  const goToApp = () => {
    router.push(process.env.NEXT_PUBLIC_APP_URL ?? '')
  }

  return <Button onClick={goToApp}>Start now</Button>
}
