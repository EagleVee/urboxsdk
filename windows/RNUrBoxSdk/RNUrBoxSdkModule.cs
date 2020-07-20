using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Ur.Box.Sdk.RNUrBoxSdk
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNUrBoxSdkModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNUrBoxSdkModule"/>.
        /// </summary>
        internal RNUrBoxSdkModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNUrBoxSdk";
            }
        }
    }
}
