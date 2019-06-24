package io.github.breadkey.pokemonchess.gameengine2d

open class GameObject {
    val transform = Transform()
    var parent: GameObject? = null
    var spriteRenderer: SpriteRenderer? = null
        private set
    private val children = arrayListOf<GameObject>()
    private val components = arrayListOf<GameObjectComponent>()

    fun addChild(child: GameObject) {
        if (!children.contains(child)) {
            children.add(child)
            child.parent = this
        }
    }

    fun removeChild(child: GameObject) {
        val index = child
    }

    fun getChildren(): List<GameObject> {
        return children
    }

    fun addComponent(component: GameObjectComponent) {
        if (!components.contains(component)) {
            if (component is SpriteRenderer)
                spriteRenderer = component
            components.add(component)
            component.gameObject = this
        }
    }

    fun removeComponent(component: GameObjectComponent) {
        components.remove(component)
    }
}
