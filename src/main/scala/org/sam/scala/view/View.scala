package org.sam.scala.view

import org.sam.scala.action.Action

class View {

  var actions = new Action

  def setActions(actions: Action) = {
    this.actions = actions
  }

  /*
  Loading the data after action occurred into view
 */
  def showData() = {}
}
