package sketch

import processing.core.PApplet

fun PApplet.matrix(block: () -> Unit) {
    pushMatrix()
    block()
    popMatrix()
}
