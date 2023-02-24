package com.tqy
package authority

import java.util.Date

package object PublicData {
  private val privateTime = new Date()
  private[authority] val privatePTime = new Date()
  protected val protectedTime = new Date()
  val defaultTime = new Date()

}
