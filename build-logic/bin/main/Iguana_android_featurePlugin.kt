/**
 * Precompiled [iguana.android.feature.gradle.kts][Iguana_android_feature_gradle] script plugin.
 *
 * @see Iguana_android_feature_gradle
 */
public
class Iguana_android_featurePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Iguana_android_feature_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
