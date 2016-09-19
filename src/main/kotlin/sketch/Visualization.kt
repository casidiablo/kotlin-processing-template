package sketch

import processing.core.PApplet

open class Visualization : PApplet() {

    override fun settings() {
        size(400, 400, P3D)
        pixelDensity(displayDensity())
    }

    override fun setup() {
        colorMode(HSB, TWO_PI, 2f, 1f, 1f)
        frameRate(12f)
    }

    override fun draw() {
        background(0)
        strokeWeight(5f)
        noFill()
        stroke(color(random(TWO_PI), 1f, 1f), random(255f))
        ellipse(width / 2f, height / 2f, width * 0.4f, height * 0.4f)
    }
}
