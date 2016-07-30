@file:Suppress("UNCHECKED_CAST")

package tornadofx.osgi.impl

import org.osgi.framework.FrameworkUtil
import org.osgi.framework.ServiceEvent
import tornadofx.osgi.impl.Activator

val ServiceEvent.objectClass: String
    get() = (serviceReference.getProperty("objectClass") as Array<String>)[0]

val bundleContext = FrameworkUtil.getBundle(Activator::class.java).bundleContext