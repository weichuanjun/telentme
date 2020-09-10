import Login from "../page/Login";
import Dashboard from "../page/Dashboard";
import Profile from "../page/Profile";

export const mainRoutes = [
  {
    path: "/login",
    component: Login,
  },
  // {
  //     path: "/404",
  //     component: PageNotFound
  // }
];

export const adminRoutes = [
  {
    path: "/admin/dashboard",
    component: Dashboard,
  },
  {
    path: "/admin/profile",
    component: Profile,
  },
];
